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

public val SolidGroup.BxsMeh: ImageVector
    get() {
        if (_bxsMeh != null) {
            return _bxsMeh!!
        }
        _bxsMeh = Builder(name = "BxsMeh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(7.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 10.5f)
                close()
                moveTo(16.0f, 17.0f)
                lineTo(7.974f, 17.0f)
                verticalLineToRelative(-2.0f)
                lineTo(16.0f, 15.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.493f, 11.986f)
                arcToRelative(1.494f, 1.494f, 0.0f, true, true, 0.001f, -2.987f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, -0.001f, 2.987f)
                close()
            }
        }
        .build()
        return _bxsMeh!!
    }

private var _bxsMeh: ImageVector? = null
