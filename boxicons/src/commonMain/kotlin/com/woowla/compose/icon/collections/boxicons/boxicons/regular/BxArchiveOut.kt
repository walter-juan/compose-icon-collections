package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxArchiveOut: ImageVector
    get() {
        if (_bxArchiveOut != null) {
            return _bxArchiveOut!!
        }
        _bxArchiveOut = Builder(name = "BxArchiveOut", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.706f, 5.292f)
                lineToRelative(-2.999f, -2.999f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.707f, 0.293f)
                lineTo(2.294f, 5.292f)
                arcTo(0.994f, 0.994f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -0.294f, -0.708f)
                close()
                moveTo(6.414f, 4.0f)
                horizontalLineToRelative(11.172f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineTo(5.414f)
                lineToRelative(1.0f, -1.0f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(0.002f, 12.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _bxArchiveOut!!
    }

private var _bxArchiveOut: ImageVector? = null
