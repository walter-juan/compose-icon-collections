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

public val RegularGroup.BxUpArrow: ImageVector
    get() {
        if (_bxUpArrow != null) {
            return _bxUpArrow!!
        }
        _bxUpArrow = Builder(name = "BxUpArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, 0.823f, -1.569f)
                lineToRelative(-9.0f, -13.0f)
                curveToRelative(-0.373f, -0.539f, -1.271f, -0.539f, -1.645f, 0.0f)
                lineToRelative(-9.0f, 13.0f)
                arcTo(0.999f, 0.999f, 0.0f, false, false, 3.0f, 19.0f)
                close()
                moveTo(12.0f, 6.757f)
                lineTo(19.092f, 17.0f)
                lineTo(4.908f, 17.0f)
                lineTo(12.0f, 6.757f)
                close()
            }
        }
        .build()
        return _bxUpArrow!!
    }

private var _bxUpArrow: ImageVector? = null