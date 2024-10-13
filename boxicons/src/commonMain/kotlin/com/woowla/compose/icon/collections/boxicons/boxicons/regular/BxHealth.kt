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

public val RegularGroup.BxHealth: ImageVector
    get() {
        if (_bxHealth != null) {
            return _bxHealth!!
        }
        _bxHealth = Builder(name = "BxHealth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.649f, 5.286f)
                lineTo(14.0f, 8.548f)
                verticalLineTo(2.025f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.523f)
                lineTo(4.351f, 5.286f)
                lineToRelative(-2.0f, 3.465f)
                lineToRelative(5.648f, 3.261f)
                lineToRelative(-5.648f, 3.261f)
                lineToRelative(2.0f, 3.465f)
                lineTo(10.0f, 15.477f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.523f)
                lineToRelative(5.649f, 3.261f)
                lineToRelative(2.0f, -3.465f)
                lineToRelative(-5.648f, -3.261f)
                lineToRelative(5.648f, -3.261f)
                close()
            }
        }
        .build()
        return _bxHealth!!
    }

private var _bxHealth: ImageVector? = null
