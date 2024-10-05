package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.ScubaDivingTank: ImageVector
    get() {
        if (_scubaDivingTank != null) {
            return _scubaDivingTank!!
        }
        _scubaDivingTank = Builder(name = "ScubaDivingTank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.732f, 1.0f)
                horizontalLineToRelative(1.15f)
                arcToRelative(1.496f, 1.496f, 0.0f, false, true, 2.236f, 0.0f)
                horizontalLineToRelative(1.882f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineToRelative(-1.883f, 0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.115f, 0.116f)
                verticalLineToRelative(0.983f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 3.998f, 4.9f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.0f, -4.9f)
                verticalLineToRelative(-0.983f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.117f, -0.116f)
                horizontalLineToRelative(-1.151f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -1.732f, -3.001f)
            }
        }
        .build()
        return _scubaDivingTank!!
    }

private var _scubaDivingTank: ImageVector? = null
