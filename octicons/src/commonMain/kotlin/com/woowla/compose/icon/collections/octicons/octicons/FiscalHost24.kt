package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.FiscalHost24: ImageVector
    get() {
        if (_fiscalHost24 != null) {
            return _fiscalHost24!!
        }
        _fiscalHost24 = Builder(name = "FiscalHost24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 2.784f, 2.784f, 2.0f, 3.75f, 2.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(14.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 20.0f)
                lineTo(19.0f, 20.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(17.0f, 20.0f)
                lineTo(6.997f, 20.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(4.997f, 20.0f)
                lineTo(3.75f, 20.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 18.25f)
                lineTo(2.0f, 3.75f)
                close()
                moveTo(3.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(20.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(3.75f, 3.5f)
                close()
                moveTo(14.318f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(6.0f, 8.5f)
                arcTo(0.75f, 0.75f, 0.0f, true, false, 6.0f, 10.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.5f)
                lineTo(7.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 16.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(18.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 5.5f)
                lineTo(9.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 7.0f)
                verticalLineToRelative(1.5f)
                lineTo(6.0f, 8.5f)
                close()
                moveTo(9.0f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 9.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _fiscalHost24!!
    }

private var _fiscalHost24: ImageVector? = null
