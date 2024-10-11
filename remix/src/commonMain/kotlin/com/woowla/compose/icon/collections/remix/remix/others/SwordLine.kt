package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.SwordLine: ImageVector
    get() {
        if (_swordLine != null) {
            return _swordLine!!
        }
        _swordLine = Builder(name = "SwordLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.456f, 3.0f)
                lineTo(20.999f, 3.003f)
                lineTo(21.001f, 6.526f)
                lineTo(15.534f, 11.992f)
                lineTo(18.362f, 14.821f)
                lineTo(19.777f, 13.407f)
                lineTo(21.191f, 14.821f)
                lineTo(18.717f, 17.296f)
                lineTo(21.545f, 20.125f)
                lineTo(20.131f, 21.539f)
                lineTo(17.302f, 18.71f)
                lineTo(14.828f, 21.185f)
                lineTo(13.413f, 19.771f)
                lineTo(14.827f, 18.356f)
                lineTo(11.998f, 15.528f)
                lineTo(9.17f, 18.356f)
                lineTo(10.585f, 19.771f)
                lineTo(9.171f, 21.185f)
                lineTo(6.696f, 18.71f)
                lineTo(3.867f, 21.539f)
                lineTo(2.453f, 20.125f)
                lineTo(5.282f, 17.296f)
                lineTo(2.807f, 14.821f)
                lineTo(4.221f, 13.407f)
                lineTo(5.635f, 14.82f)
                lineTo(8.462f, 11.992f)
                lineTo(3.002f, 6.531f)
                lineTo(2.999f, 3.0f)
                lineTo(6.545f, 3.003f)
                lineTo(11.998f, 8.457f)
                lineTo(17.456f, 3.0f)
                close()
                moveTo(9.876f, 13.406f)
                lineTo(7.048f, 16.234f)
                lineTo(7.756f, 16.941f)
                lineTo(10.583f, 14.113f)
                lineTo(9.876f, 13.406f)
                close()
                moveTo(19.0f, 5.001f)
                horizontalLineTo(18.283f)
                lineTo(13.412f, 9.87f)
                lineTo(14.119f, 10.577f)
                lineTo(19.0f, 5.698f)
                verticalLineTo(5.001f)
                close()
                moveTo(5.0f, 5.001f)
                verticalLineTo(5.701f)
                lineTo(16.241f, 16.942f)
                lineTo(16.948f, 16.235f)
                lineTo(5.715f, 5.002f)
                lineTo(5.0f, 5.001f)
                close()
            }
        }
        .build()
        return _swordLine!!
    }

private var _swordLine: ImageVector? = null
