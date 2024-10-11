package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.Brush2Line: ImageVector
    get() {
        if (_brush2Line != null) {
            return _brush2Line!!
        }
        _brush2Line = Builder(name = "Brush2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.536f, 15.946f)
                lineTo(18.657f, 13.825f)
                lineTo(15.475f, 10.643f)
                lineTo(19.011f, 7.108f)
                lineTo(16.889f, 4.986f)
                lineTo(13.354f, 8.522f)
                lineTo(10.172f, 5.34f)
                lineTo(8.05f, 7.461f)
                lineTo(16.536f, 15.946f)
                close()
                moveTo(15.122f, 17.361f)
                lineTo(6.636f, 8.875f)
                lineTo(3.808f, 11.704f)
                lineTo(12.293f, 20.189f)
                lineTo(15.122f, 17.361f)
                close()
                moveTo(13.354f, 5.693f)
                lineTo(16.182f, 2.865f)
                curveTo(16.573f, 2.475f, 17.206f, 2.475f, 17.596f, 2.865f)
                lineTo(21.132f, 6.401f)
                curveTo(21.522f, 6.791f, 21.522f, 7.424f, 21.132f, 7.815f)
                lineTo(18.303f, 10.643f)
                lineTo(20.778f, 13.118f)
                curveTo(21.169f, 13.509f, 21.169f, 14.142f, 20.778f, 14.532f)
                lineTo(13.0f, 22.31f)
                curveTo(12.61f, 22.701f, 11.976f, 22.701f, 11.586f, 22.31f)
                lineTo(1.686f, 12.411f)
                curveTo(1.296f, 12.021f, 1.296f, 11.387f, 1.686f, 10.997f)
                lineTo(9.465f, 3.219f)
                curveTo(9.855f, 2.828f, 10.488f, 2.828f, 10.879f, 3.219f)
                lineTo(13.354f, 5.693f)
                close()
            }
        }
        .build()
        return _brush2Line!!
    }

private var _brush2Line: ImageVector? = null
