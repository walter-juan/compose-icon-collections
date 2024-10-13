package com.woowla.compose.icon.collections.devicons.devicons.vala

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ValaGroup

public val ValaGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(62.96f, 32.05f)
                curveToRelative(-7.55f, 0.0f, -14.78f, 2.43f, -21.68f, 7.28f)
                curveToRelative(-3.02f, 2.19f, -5.49f, 4.71f, -7.42f, 7.55f)
                curveToRelative(-1.9f, 2.81f, -2.84f, 5.74f, -2.84f, 8.79f)
                curveToRelative(0.0f, 1.66f, 0.21f, 3.05f, 0.62f, 4.17f)
                curveToRelative(1.21f, 3.11f, 4.25f, 4.66f, 9.1f, 4.66f)
                curveToRelative(0.0f, -0.18f, -0.07f, -0.38f, -0.22f, -0.62f)
                curveToRelative(-0.68f, -1.24f, -1.02f, -3.1f, -1.02f, -5.55f)
                curveToRelative(0.0f, -5.06f, 1.18f, -9.3f, 3.55f, -12.7f)
                curveToRelative(2.4f, -3.41f, 5.73f, -5.91f, 9.99f, -7.51f)
                lineToRelative(1.46f, 62.14f)
                horizontalLineToRelative(13.1f)
                lineToRelative(25.27f, -67.78f)
                horizontalLineToRelative(-6.35f)
                lineToRelative(-19.14f, 55.7f)
                lineToRelative(-0.8f, -55.96f)
                curveToRelative(-1.18f, -0.12f, -2.4f, -0.18f, -3.64f, -0.18f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
