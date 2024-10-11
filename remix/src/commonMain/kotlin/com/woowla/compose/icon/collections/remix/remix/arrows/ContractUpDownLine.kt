package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ContractUpDownLine: ImageVector
    get() {
        if (_contractUpDownLine != null) {
            return _contractUpDownLine!!
        }
        _contractUpDownLine = Builder(name = "ContractUpDownLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.793f, 5.207f)
                lineTo(12.0f, 11.414f)
                lineTo(18.207f, 5.207f)
                lineTo(16.793f, 3.793f)
                lineTo(12.0f, 8.586f)
                lineTo(7.207f, 3.793f)
                lineTo(5.793f, 5.207f)
                close()
                moveTo(18.207f, 18.793f)
                lineTo(12.0f, 12.586f)
                lineTo(5.793f, 18.793f)
                lineTo(7.207f, 20.207f)
                lineTo(12.0f, 15.414f)
                lineTo(16.793f, 20.207f)
                lineTo(18.207f, 18.793f)
                close()
            }
        }
        .build()
        return _contractUpDownLine!!
    }

private var _contractUpDownLine: ImageVector? = null
