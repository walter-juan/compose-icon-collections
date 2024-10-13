package com.woowla.compose.icon.collections.devicons.devicons.clion

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ClionGroup

public val ClionGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF21d789)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.09f, 5.48f)
                lineTo(16.3f, 26.78f)
                lineTo(5.48f, 91.53f)
                lineToRelative(37.95f, 27.62f)
                lineToRelative(16.25f, -14.65f)
                lineTo(74.81f, 116.2f)
                lineToRelative(29.26f, 6.32f)
                lineToRelative(18.45f, -41.75f)
                lineToRelative(-21.45f, -7.99f)
                verticalLineToRelative(28.3f)
                lineTo(26.93f, 101.07f)
                lineTo(26.93f, 26.93f)
                horizontalLineToRelative(74.14f)
                verticalLineToRelative(37.04f)
                lineToRelative(19.12f, -23.41f)
                lineToRelative(-15.06f, -30.61f)
                lineToRelative(-28.42f, 10.28f)
                lineTo(50.09f, 5.48f)
                close()
                moveTo(27.93f, 27.93f)
                verticalLineToRelative(72.14f)
                horizontalLineToRelative(72.14f)
                lineTo(100.07f, 27.93f)
                lineTo(27.93f, 27.93f)
                close()
                moveTo(49.02f, 36.05f)
                arcToRelative(14.28f, 14.28f, 0.0f, false, true, 10.9f, 4.27f)
                lineToRelative(-3.84f, 4.48f)
                arcToRelative(10.22f, 10.22f, 0.0f, false, false, -7.09f, -3.12f)
                curveToRelative(-4.66f, 0.0f, -8.01f, 3.86f, -8.01f, 8.6f)
                verticalLineToRelative(0.09f)
                curveToRelative(0.0f, 4.74f, 3.28f, 8.69f, 8.01f, 8.69f)
                curveToRelative(3.17f, 0.0f, 5.1f, -1.22f, 7.32f, -3.24f)
                lineToRelative(3.8f, 3.92f)
                arcToRelative(14.14f, 14.14f, 0.0f, false, true, -11.35f, 4.88f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, true, -10.08f, -4.09f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, true, -4.08f, -10.09f)
                verticalLineToRelative(-0.08f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, true, 4.16f, -10.23f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, true, 10.27f, -4.08f)
                close()
                moveTo(64.06f, 36.5f)
                horizontalLineToRelative(6.09f)
                verticalLineToRelative(22.42f)
                horizontalLineToRelative(12.01f)
                lineTo(82.16f, 64.0f)
                lineTo(64.06f, 64.0f)
                lineTo(64.06f, 36.5f)
                close()
                moveTo(36.55f, 86.75f)
                horizontalLineToRelative(27.43f)
                verticalLineToRelative(4.57f)
                horizontalLineToRelative(-27.43f)
                verticalLineToRelative(-4.57f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
