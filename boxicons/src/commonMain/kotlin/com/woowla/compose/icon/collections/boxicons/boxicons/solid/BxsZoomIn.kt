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

public val SolidGroup.BxsZoomIn: ImageVector
    get() {
        if (_bxsZoomIn != null) {
            return _bxsZoomIn!!
        }
        _bxsZoomIn = Builder(name = "BxsZoomIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                arcToRelative(7.952f, 7.952f, 0.0f, false, false, 4.897f, -1.688f)
                lineToRelative(4.396f, 4.396f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.396f, -4.396f)
                arcTo(7.952f, 7.952f, 0.0f, false, false, 18.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsZoomIn!!
    }

private var _bxsZoomIn: ImageVector? = null