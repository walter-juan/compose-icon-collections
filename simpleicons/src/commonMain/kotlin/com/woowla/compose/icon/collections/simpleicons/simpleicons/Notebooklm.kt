package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Notebooklm: ImageVector
    get() {
        if (_notebooklm != null) {
            return _notebooklm!!
        }
        _notebooklm = Builder(name = "Notebooklm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 3.201f)
                curveTo(5.372f, 3.201f, 0.0f, 8.528f, 0.0f, 15.101f)
                verticalLineTo(20.8f)
                horizontalLineToRelative(2.212f)
                verticalLineToRelative(-0.568f)
                curveToRelative(0.0f, -2.666f, 2.178f, -4.827f, 4.866f, -4.827f)
                curveToRelative(2.688f, 0.0f, 4.866f, 2.16f, 4.866f, 4.827f)
                verticalLineToRelative(0.568f)
                horizontalLineToRelative(2.212f)
                verticalLineToRelative(-0.568f)
                curveToRelative(0.0f, -3.877f, -3.17f, -7.019f, -7.078f, -7.019f)
                arcTo(7.075f, 7.075f, 0.0f, false, false, 2.992f, 14.5f)
                arcToRelative(7.355f, 7.355f, 0.0f, false, true, 6.568f, -4.016f)
                curveToRelative(4.057f, 0.0f, 7.347f, 3.264f, 7.347f, 7.287f)
                verticalLineTo(20.8f)
                horizontalLineToRelative(2.212f)
                verticalLineTo(17.77f)
                curveToRelative(0.0f, -5.235f, -4.28f, -9.481f, -9.56f, -9.481f)
                arcToRelative(9.563f, 9.563f, 0.0f, false, false, -6.217f, 2.28f)
                arcTo(9.795f, 9.795f, 0.0f, false, true, 12.0f, 5.393f)
                curveToRelative(5.406f, 0.0f, 9.788f, 4.346f, 9.788f, 9.707f)
                verticalLineTo(20.8f)
                horizontalLineTo(24.0f)
                verticalLineTo(15.1f)
                curveToRelative(-0.001f, -6.573f, -5.373f, -11.9f, -12.001f, -11.9f)
                close()
            }
        }
        .build()
        return _notebooklm!!
    }

private var _notebooklm: ImageVector? = null
