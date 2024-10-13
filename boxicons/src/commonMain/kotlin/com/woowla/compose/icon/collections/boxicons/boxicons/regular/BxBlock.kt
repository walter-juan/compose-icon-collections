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

public val RegularGroup.BxBlock: ImageVector
    get() {
        if (_bxBlock != null) {
            return _bxBlock!!
        }
        _bxBlock = Builder(name = "BxBlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -1.846f, 0.634f, -3.542f, 1.688f, -4.897f)
                lineToRelative(11.209f, 11.209f)
                arcTo(7.946f, 7.946f, 0.0f, false, true, 12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                close()
                moveTo(18.312f, 16.897f)
                lineTo(7.103f, 5.688f)
                arcTo(7.948f, 7.948f, 0.0f, false, true, 12.0f, 4.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                arcToRelative(7.954f, 7.954f, 0.0f, false, true, -1.688f, 4.897f)
                close()
            }
        }
        .build()
        return _bxBlock!!
    }

private var _bxBlock: ImageVector? = null
