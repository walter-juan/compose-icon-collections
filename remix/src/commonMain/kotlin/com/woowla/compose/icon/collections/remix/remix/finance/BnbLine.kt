package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.BnbLine: ImageVector
    get() {
        if (_bnbLine != null) {
            return _bnbLine!!
        }
        _bnbLine = Builder(name = "BnbLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.689f)
                lineTo(9.991f, 19.526f)
                lineTo(9.988f, 21.835f)
                lineTo(12.0f, 23.0f)
                lineTo(14.012f, 21.836f)
                lineTo(14.009f, 19.526f)
                lineTo(12.0f, 20.689f)
                close()
                moveTo(16.007f, 18.369f)
                lineTo(16.01f, 20.678f)
                lineTo(21.5f, 17.5f)
                verticalLineTo(11.146f)
                lineTo(19.5f, 12.297f)
                verticalLineTo(16.347f)
                lineTo(16.007f, 18.369f)
                close()
                moveTo(19.5f, 9.989f)
                lineTo(21.5f, 8.838f)
                verticalLineTo(6.5f)
                lineTo(19.504f, 5.344f)
                lineTo(17.508f, 6.5f)
                lineTo(19.5f, 7.653f)
                verticalLineTo(9.989f)
                close()
                moveTo(15.512f, 5.344f)
                lineTo(17.508f, 4.189f)
                lineTo(12.0f, 1.0f)
                lineTo(6.492f, 4.189f)
                lineTo(8.488f, 5.345f)
                lineTo(12.0f, 3.311f)
                lineTo(15.512f, 5.344f)
                close()
                moveTo(6.492f, 6.5f)
                lineTo(4.496f, 5.345f)
                lineTo(2.5f, 6.5f)
                verticalLineTo(8.838f)
                lineTo(4.5f, 9.99f)
                verticalLineTo(7.653f)
                lineTo(6.492f, 6.5f)
                close()
                moveTo(2.5f, 11.146f)
                lineTo(4.5f, 12.298f)
                verticalLineTo(16.347f)
                lineTo(7.992f, 18.369f)
                lineTo(7.989f, 20.678f)
                lineTo(2.5f, 17.5f)
                verticalLineTo(11.146f)
                close()
                moveTo(17.5f, 8.806f)
                lineTo(15.512f, 7.656f)
                lineTo(12.0f, 9.689f)
                lineTo(8.488f, 7.656f)
                lineTo(6.5f, 8.806f)
                verticalLineTo(11.141f)
                lineTo(9.998f, 13.156f)
                lineTo(9.994f, 17.216f)
                lineTo(12.0f, 18.378f)
                lineTo(14.006f, 17.217f)
                lineTo(14.001f, 13.155f)
                lineTo(17.5f, 11.141f)
                verticalLineTo(8.806f)
                close()
                moveTo(7.995f, 16.059f)
                lineTo(7.997f, 14.311f)
                lineTo(6.5f, 13.449f)
                verticalLineTo(15.194f)
                lineTo(7.995f, 16.059f)
                close()
                moveTo(10.483f, 6.5f)
                lineTo(12.0f, 7.378f)
                lineTo(13.516f, 6.5f)
                lineTo(12.0f, 5.622f)
                lineTo(10.483f, 6.5f)
                close()
                moveTo(16.003f, 14.311f)
                lineTo(17.5f, 13.449f)
                verticalLineTo(15.194f)
                lineTo(16.005f, 16.06f)
                lineTo(16.003f, 14.311f)
                close()
            }
        }
        .build()
        return _bnbLine!!
    }

private var _bnbLine: ImageVector? = null
