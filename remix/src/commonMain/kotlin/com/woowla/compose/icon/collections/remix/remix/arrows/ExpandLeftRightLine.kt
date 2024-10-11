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

public val ArrowsGroup.ExpandLeftRightLine: ImageVector
    get() {
        if (_expandLeftRightLine != null) {
            return _expandLeftRightLine!!
        }
        _expandLeftRightLine = Builder(name = "ExpandLeftRightLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.043f, 5.793f)
                lineTo(2.836f, 12.0f)
                lineTo(9.043f, 18.207f)
                lineTo(10.457f, 16.793f)
                lineTo(5.664f, 12.0f)
                lineTo(10.457f, 7.207f)
                lineTo(9.043f, 5.793f)
                close()
                moveTo(14.957f, 18.207f)
                lineTo(21.164f, 12.0f)
                lineTo(14.957f, 5.793f)
                lineTo(13.543f, 7.207f)
                lineTo(18.336f, 12.0f)
                lineTo(13.543f, 16.793f)
                lineTo(14.957f, 18.207f)
                close()
            }
        }
        .build()
        return _expandLeftRightLine!!
    }

private var _expandLeftRightLine: ImageVector? = null
