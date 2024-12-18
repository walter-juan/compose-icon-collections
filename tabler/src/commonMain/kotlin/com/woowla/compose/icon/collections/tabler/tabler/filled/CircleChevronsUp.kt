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

public val FilledGroup.CircleChevronsUp: ImageVector
    get() {
        if (_circleChevronsUp != null) {
            return _circleChevronsUp!!
        }
        _circleChevronsUp = Builder(name = "CircleChevronsUp", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.867f, 2.001f)
                curveToRelative(5.495f, 0.0f, 9.96f, 4.432f, 10.0f, 9.926f)
                reflectiveCurveToRelative(-4.359f, 9.993f, -9.852f, 10.073f)
                horizontalLineToRelative(-0.295f)
                curveToRelative(-5.493f, -0.081f, -9.893f, -4.579f, -9.852f, -10.073f)
                curveToRelative(0.04f, -5.494f, 4.505f, -9.926f, 10.0f, -9.926f)
                moveToRelative(0.84f, 9.292f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -0.083f)
                lineToRelative(2.292f, -2.292f)
                lineToRelative(2.293f, 2.292f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                close()
                moveTo(12.708f, 7.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -0.083f)
                lineToRelative(2.292f, -2.292f)
                lineToRelative(2.293f, 2.292f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _circleChevronsUp!!
    }

private var _circleChevronsUp: ImageVector? = null
