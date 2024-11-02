package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 4.478f)
                verticalLineTo(4.705f)
                curveTo(17.455f, 4.792f, 18.402f, 4.907f, 19.34f, 5.049f)
                curveTo(19.687f, 5.101f, 20.033f, 5.158f, 20.378f, 5.217f)
                curveTo(20.786f, 5.288f, 21.06f, 5.676f, 20.989f, 6.084f)
                curveTo(20.918f, 6.492f, 20.53f, 6.766f, 20.122f, 6.695f)
                curveTo(20.052f, 6.683f, 19.983f, 6.671f, 19.913f, 6.66f)
                lineTo(18.908f, 19.73f)
                curveTo(18.788f, 21.293f, 17.484f, 22.5f, 15.917f, 22.5f)
                horizontalLineTo(8.084f)
                curveTo(6.516f, 22.5f, 5.213f, 21.293f, 5.093f, 19.73f)
                lineTo(4.087f, 6.66f)
                curveTo(4.017f, 6.671f, 3.948f, 6.683f, 3.878f, 6.695f)
                curveTo(3.47f, 6.766f, 3.082f, 6.492f, 3.011f, 6.084f)
                curveTo(2.94f, 5.676f, 3.214f, 5.288f, 3.622f, 5.217f)
                curveTo(3.967f, 5.158f, 4.313f, 5.101f, 4.66f, 5.049f)
                curveTo(5.599f, 4.907f, 6.545f, 4.792f, 7.5f, 4.705f)
                verticalLineTo(4.478f)
                curveTo(7.5f, 2.914f, 8.713f, 1.578f, 10.316f, 1.527f)
                curveTo(10.875f, 1.509f, 11.436f, 1.5f, 12.0f, 1.5f)
                curveTo(12.564f, 1.5f, 13.125f, 1.509f, 13.685f, 1.527f)
                curveTo(15.288f, 1.578f, 16.5f, 2.914f, 16.5f, 4.478f)
                close()
                moveTo(10.363f, 3.026f)
                curveTo(10.907f, 3.009f, 11.453f, 3.0f, 12.0f, 3.0f)
                curveTo(12.548f, 3.0f, 13.093f, 3.009f, 13.637f, 3.026f)
                curveTo(14.391f, 3.05f, 15.0f, 3.684f, 15.0f, 4.478f)
                verticalLineTo(4.591f)
                curveTo(14.008f, 4.531f, 13.007f, 4.5f, 12.0f, 4.5f)
                curveTo(10.993f, 4.5f, 9.992f, 4.531f, 9.0f, 4.591f)
                verticalLineTo(4.478f)
                curveTo(9.0f, 3.684f, 9.609f, 3.05f, 10.363f, 3.026f)
                close()
                moveTo(10.009f, 8.971f)
                curveTo(9.993f, 8.557f, 9.644f, 8.235f, 9.23f, 8.251f)
                curveTo(8.817f, 8.266f, 8.494f, 8.615f, 8.51f, 9.029f)
                lineTo(8.856f, 18.029f)
                curveTo(8.872f, 18.443f, 9.22f, 18.765f, 9.634f, 18.749f)
                curveTo(10.048f, 18.733f, 10.371f, 18.385f, 10.355f, 17.971f)
                lineTo(10.009f, 8.971f)
                close()
                moveTo(15.49f, 9.029f)
                curveTo(15.505f, 8.615f, 15.183f, 8.266f, 14.769f, 8.251f)
                curveTo(14.355f, 8.235f, 14.007f, 8.557f, 13.991f, 8.971f)
                lineTo(13.644f, 17.971f)
                curveTo(13.628f, 18.385f, 13.951f, 18.733f, 14.365f, 18.749f)
                curveTo(14.779f, 18.765f, 15.127f, 18.443f, 15.143f, 18.029f)
                lineTo(15.49f, 9.029f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
