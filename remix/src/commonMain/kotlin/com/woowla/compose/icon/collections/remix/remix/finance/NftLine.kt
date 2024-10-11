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

public val FinanceGroup.NftLine: ImageVector
    get() {
        if (_nftLine != null) {
            return _nftLine!!
        }
        _nftLine = Builder(name = "NftLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveTo(10.105f, 12.0f, 11.0f, 11.105f, 11.0f, 10.0f)
                curveTo(11.0f, 8.895f, 10.105f, 8.0f, 9.0f, 8.0f)
                curveTo(7.895f, 8.0f, 7.0f, 8.895f, 7.0f, 10.0f)
                curveTo(7.0f, 11.105f, 7.895f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(21.5f, 6.5f)
                lineTo(12.0f, 1.0f)
                lineTo(2.5f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(12.0f, 23.0f)
                lineTo(21.5f, 17.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(12.0f, 3.311f)
                lineTo(19.5f, 7.653f)
                verticalLineTo(14.534f)
                lineTo(14.938f, 11.797f)
                lineTo(6.967f, 17.775f)
                lineTo(4.5f, 16.347f)
                verticalLineTo(7.653f)
                lineTo(12.0f, 3.311f)
                close()
                moveTo(12.0f, 20.689f)
                lineTo(8.848f, 18.864f)
                lineTo(15.062f, 14.203f)
                lineTo(19.059f, 16.602f)
                lineTo(12.0f, 20.689f)
                close()
            }
        }
        .build()
        return _nftLine!!
    }

private var _nftLine: ImageVector? = null
