package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCode: ImageVector
    get() {
        if (_bxCode != null) {
            return _bxCode!!
        }
        _bxCode = Builder(name = "BxCode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.293f, 6.293f)
                lineTo(2.586f, 12.0f)
                lineToRelative(5.707f, 5.707f)
                lineToRelative(1.414f, -1.414f)
                lineTo(5.414f, 12.0f)
                lineToRelative(4.293f, -4.293f)
                close()
                moveTo(15.707f, 17.707f)
                lineTo(21.414f, 12.0f)
                lineToRelative(-5.707f, -5.707f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(18.586f, 12.0f)
                lineToRelative(-4.293f, 4.293f)
                close()
            }
        }
        .build()
        return _bxCode!!
    }

private var _bxCode: ImageVector? = null
