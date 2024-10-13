package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsUpArrow: ImageVector
    get() {
        if (_bxsUpArrow != null) {
            return _bxsUpArrow!!
        }
        _bxsUpArrow = Builder(name = "BxsUpArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
            }
        }
        .build()
        return _bxsUpArrow!!
    }

private var _bxsUpArrow: ImageVector? = null
