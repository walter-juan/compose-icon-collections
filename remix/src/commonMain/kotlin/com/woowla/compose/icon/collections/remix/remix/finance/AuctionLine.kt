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

public val FinanceGroup.AuctionLine: ImageVector
    get() {
        if (_auctionLine != null) {
            return _auctionLine!!
        }
        _auctionLine = Builder(name = "AuctionLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.005f, 20.003f)
                verticalLineTo(22.003f)
                horizontalLineTo(2.005f)
                verticalLineTo(20.003f)
                horizontalLineTo(14.005f)
                close()
                moveTo(14.591f, 0.689f)
                lineTo(22.369f, 8.467f)
                lineTo(20.955f, 9.881f)
                lineTo(19.894f, 9.528f)
                lineTo(17.419f, 12.003f)
                lineTo(23.076f, 17.66f)
                lineTo(21.662f, 19.074f)
                lineTo(16.005f, 13.417f)
                lineTo(13.601f, 15.821f)
                lineTo(13.884f, 16.952f)
                lineTo(12.469f, 18.367f)
                lineTo(4.691f, 10.589f)
                lineTo(6.105f, 9.174f)
                lineTo(7.237f, 9.457f)
                lineTo(13.53f, 3.164f)
                lineTo(13.177f, 2.103f)
                lineTo(14.591f, 0.689f)
                close()
                moveTo(15.298f, 4.225f)
                lineTo(8.227f, 11.296f)
                lineTo(11.762f, 14.831f)
                lineTo(18.833f, 7.76f)
                lineTo(15.298f, 4.225f)
                close()
            }
        }
        .build()
        return _auctionLine!!
    }

private var _auctionLine: ImageVector? = null
