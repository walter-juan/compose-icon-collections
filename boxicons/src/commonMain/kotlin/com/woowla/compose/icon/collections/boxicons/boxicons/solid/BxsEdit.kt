package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsEdit: ImageVector
    get() {
        if (_bxsEdit != null) {
            return _bxsEdit!!
        }
        _bxsEdit = Builder(name = "BxsEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.988f, 2.012f)
                lineToRelative(3.0f, 3.0f)
                lineTo(19.701f, 7.3f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(7.287f, -7.287f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(8.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                horizontalLineTo(8.158f)
                curveToRelative(-0.026f, 0.0f, -0.053f, 0.01f, -0.079f, 0.01f)
                curveToRelative(-0.033f, 0.0f, -0.066f, -0.009f, -0.1f, -0.01f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(6.847f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.896f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.104f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-8.668f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _bxsEdit!!
    }

private var _bxsEdit: ImageVector? = null
