package com.woowla.compose.icon.collections.devicons.devicons.yaml

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.YamlGroup

public val YamlGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.5f, 5.63f)
                lineToRelative(21.75f, 34.15f)
                verticalLineToRelative(21.65f)
                horizontalLineToRelative(13.96f)
                verticalLineToRelative(-21.65f)
                lineToRelative(22.77f, -34.15f)
                horizontalLineToRelative(-15.02f)
                lineToRelative(-13.95f, 21.99f)
                lineToRelative(-13.83f, -21.99f)
                horizontalLineToRelative(-15.69f)
                close()
                moveTo(64.49f, 5.76f)
                lineTo(40.83f, 61.56f)
                horizontalLineToRelative(11.19f)
                lineToRelative(5.14f, -12.41f)
                horizontalLineToRelative(25.27f)
                lineToRelative(4.25f, 12.41f)
                horizontalLineToRelative(11.96f)
                lineToRelative(-22.7f, -55.8f)
                horizontalLineToRelative(-11.44f)
                close()
                moveTo(70.49f, 17.53f)
                lineTo(78.23f, 38.01f)
                horizontalLineToRelative(-16.39f)
                lineToRelative(8.64f, -20.48f)
                close()
                moveTo(86.68f, 67.67f)
                verticalLineToRelative(54.45f)
                horizontalLineToRelative(40.82f)
                verticalLineToRelative(-11.64f)
                verticalLineToRelative(-0.0f)
                horizontalLineToRelative(-28.86f)
                verticalLineToRelative(-42.81f)
                horizontalLineToRelative(-11.95f)
                close()
                moveTo(22.25f, 67.68f)
                verticalLineToRelative(54.69f)
                horizontalLineToRelative(11.73f)
                verticalLineToRelative(-37.72f)
                lineToRelative(12.28f, 25.35f)
                horizontalLineToRelative(9.23f)
                lineToRelative(12.7f, -26.25f)
                verticalLineToRelative(38.6f)
                horizontalLineToRelative(11.26f)
                verticalLineToRelative(-54.68f)
                horizontalLineToRelative(-15.37f)
                lineToRelative(-13.64f, 24.73f)
                lineToRelative(-12.99f, -24.73f)
                horizontalLineToRelative(-15.21f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
