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

public val ArrowsGroup.ContractLeftRightLine: ImageVector
    get() {
        if (_contractLeftRightLine != null) {
            return _contractLeftRightLine!!
        }
        _contractLeftRightLine = Builder(name = "ContractLeftRightLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.793f, 5.793f)
                lineTo(12.586f, 12.0f)
                lineTo(18.793f, 18.207f)
                lineTo(20.207f, 16.793f)
                lineTo(15.414f, 12.0f)
                lineTo(20.207f, 7.207f)
                lineTo(18.793f, 5.793f)
                close()
                moveTo(5.207f, 18.207f)
                lineTo(11.414f, 12.0f)
                lineTo(5.207f, 5.793f)
                lineTo(3.793f, 7.207f)
                lineTo(8.586f, 12.0f)
                lineTo(3.793f, 16.793f)
                lineTo(5.207f, 18.207f)
                close()
            }
        }
        .build()
        return _contractLeftRightLine!!
    }

private var _contractLeftRightLine: ImageVector? = null
