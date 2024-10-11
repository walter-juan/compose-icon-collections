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

public val FinanceGroup.BnbFill: ImageVector
    get() {
        if (_bnbFill != null) {
            return _bnbFill!!
        }
        _bnbFill = Builder(name = "BnbFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.167f, 4.367f)
                lineTo(12.0f, 1.0f)
                lineTo(17.833f, 4.367f)
                lineTo(15.689f, 5.611f)
                lineTo(12.0f, 3.488f)
                lineTo(8.312f, 5.611f)
                lineTo(6.167f, 4.367f)
                close()
                moveTo(17.833f, 8.613f)
                lineTo(15.689f, 7.369f)
                lineTo(12.0f, 9.492f)
                lineTo(8.312f, 7.369f)
                lineTo(6.167f, 8.613f)
                verticalLineTo(11.1f)
                lineTo(9.856f, 13.223f)
                verticalLineTo(17.469f)
                lineTo(12.0f, 18.713f)
                lineTo(14.144f, 17.469f)
                verticalLineTo(13.223f)
                lineTo(17.833f, 11.1f)
                verticalLineTo(8.613f)
                close()
                moveTo(17.833f, 15.347f)
                verticalLineTo(12.859f)
                lineTo(15.689f, 14.103f)
                verticalLineTo(16.59f)
                lineTo(17.833f, 15.347f)
                close()
                moveTo(19.355f, 16.226f)
                lineTo(15.667f, 18.349f)
                verticalLineTo(20.836f)
                lineTo(21.5f, 17.469f)
                verticalLineTo(10.736f)
                lineTo(19.355f, 11.98f)
                verticalLineTo(16.226f)
                close()
                moveTo(17.211f, 6.49f)
                lineTo(19.355f, 7.734f)
                verticalLineTo(10.221f)
                lineTo(21.5f, 8.977f)
                verticalLineTo(6.49f)
                lineTo(19.355f, 5.246f)
                lineTo(17.211f, 6.49f)
                close()
                moveTo(9.856f, 19.249f)
                verticalLineTo(21.737f)
                lineTo(12.0f, 22.981f)
                lineTo(14.144f, 21.737f)
                verticalLineTo(19.249f)
                lineTo(12.0f, 20.493f)
                lineTo(9.856f, 19.249f)
                close()
                moveTo(6.167f, 15.347f)
                lineTo(8.312f, 16.59f)
                verticalLineTo(14.103f)
                lineTo(6.167f, 12.859f)
                verticalLineTo(15.347f)
                close()
                moveTo(9.856f, 6.49f)
                lineTo(12.0f, 7.734f)
                lineTo(14.144f, 6.49f)
                lineTo(12.0f, 5.246f)
                lineTo(9.856f, 6.49f)
                close()
                moveTo(4.644f, 7.734f)
                lineTo(6.789f, 6.49f)
                lineTo(4.644f, 5.246f)
                lineTo(2.5f, 6.49f)
                verticalLineTo(8.977f)
                lineTo(4.644f, 10.221f)
                verticalLineTo(7.734f)
                close()
                moveTo(4.644f, 11.98f)
                lineTo(2.5f, 10.736f)
                verticalLineTo(17.469f)
                lineTo(8.333f, 20.836f)
                verticalLineTo(18.349f)
                lineTo(4.644f, 16.226f)
                verticalLineTo(11.98f)
                close()
            }
        }
        .build()
        return _bnbFill!!
    }

private var _bnbFill: ImageVector? = null
