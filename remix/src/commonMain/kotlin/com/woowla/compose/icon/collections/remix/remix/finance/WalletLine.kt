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

public val FinanceGroup.WalletLine: ImageVector
    get() {
        if (_walletLine != null) {
            return _walletLine!!
        }
        _walletLine = Builder(name = "WalletLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.005f, 7.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 7.0f, 22.005f, 7.448f, 22.005f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(22.005f, 20.552f, 21.557f, 21.0f, 21.005f, 21.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.0f, 2.005f, 20.552f, 2.005f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.447f, 2.453f, 3.0f, 3.005f, 3.0f)
                horizontalLineTo(18.005f)
                verticalLineTo(7.0f)
                close()
                moveTo(4.005f, 9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.005f)
                close()
                moveTo(4.005f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.005f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.005f)
                close()
                moveTo(15.005f, 13.0f)
                horizontalLineTo(18.005f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _walletLine!!
    }

private var _walletLine: ImageVector? = null
