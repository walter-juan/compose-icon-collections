package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.EaseInOutControlPoints: ImageVector
    get() {
        if (_easeInOutControlPoints != null) {
            return _easeInOutControlPoints!!
        }
        _easeInOutControlPoints = Builder(name = "EaseInOutControlPoints", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.829f, 4.0f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.83f, -2.0f)
                moveToRelative(-14.0f, -16.0f)
                curveToRelative(1.306f, 0.0f, 2.418f, 0.835f, 2.83f, 2.0f)
                horizontalLineToRelative(1.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, -2.829f, -4.0f)
                moveToRelative(9.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                curveToRelative(-2.83f, 0.0f, -4.6f, 1.845f, -8.152f, 7.53f)
                curveToRelative(-3.947f, 6.315f, -6.012f, 8.47f, -9.848f, 8.47f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                curveToRelative(2.83f, 0.0f, 4.6f, -1.845f, 8.152f, -7.53f)
                curveToRelative(3.947f, -6.315f, 6.012f, -8.47f, 9.848f, -8.47f)
            }
        }
        .build()
        return _easeInOutControlPoints!!
    }

private var _easeInOutControlPoints: ImageVector? = null
