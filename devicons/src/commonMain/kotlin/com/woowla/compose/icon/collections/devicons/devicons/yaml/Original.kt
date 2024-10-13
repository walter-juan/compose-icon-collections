package com.woowla.compose.icon.collections.devicons.devicons.yaml

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.YamlGroup

public val YamlGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.25f, 39.78f)
                lineToRelative(-21.75f, -34.15f)
                lineToRelative(15.69f, 0.0f)
                lineToRelative(13.83f, 21.99f)
                lineToRelative(13.95f, -21.99f)
                lineToRelative(15.02f, 0.0f)
                lineToRelative(-22.77f, 34.15f)
                lineToRelative(0.0f, 21.65f)
                lineToRelative(-13.96f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFcb171e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(82.43f, 49.15f)
                horizontalLineToRelative(-25.27f)
                lineToRelative(-5.14f, 12.41f)
                horizontalLineToRelative(-11.19f)
                lineToRelative(23.66f, -55.8f)
                horizontalLineToRelative(11.44f)
                lineToRelative(22.7f, 55.8f)
                horizontalLineToRelative(-11.96f)
                lineToRelative(-4.25f, -12.41f)
                close()
                moveTo(78.23f, 38.01f)
                lineTo(70.49f, 17.53f)
                lineTo(61.84f, 38.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.25f, 67.69f)
                lineToRelative(0.0f, 54.69f)
                lineToRelative(11.73f, 0.0f)
                lineToRelative(0.0f, -37.72f)
                lineToRelative(12.28f, 25.36f)
                lineToRelative(9.23f, 0.0f)
                lineToRelative(12.7f, -26.25f)
                lineToRelative(0.0f, 38.6f)
                lineToRelative(11.26f, 0.0f)
                lineToRelative(0.0f, -54.68f)
                lineToRelative(-15.37f, 0.0f)
                lineToRelative(-13.64f, 24.73f)
                lineToRelative(-12.99f, -24.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(127.5f, 110.49f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-28.86f, 0.0f)
                lineToRelative(0.0f, -42.82f)
                lineToRelative(-11.96f, 0.0f)
                lineToRelative(0.0f, 54.45f)
                lineToRelative(40.82f, 0.0f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
