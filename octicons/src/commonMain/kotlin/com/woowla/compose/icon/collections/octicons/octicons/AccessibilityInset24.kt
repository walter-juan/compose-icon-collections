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

public val Octicons.AccessibilityInset24: ImageVector
    get() {
        if (_accessibilityInset24 != null) {
            return _accessibilityInset24!!
        }
        _accessibilityInset24 = Builder(name = "AccessibilityInset24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.5f, 6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(12.0f, 9.0f)
                horizontalLineToRelative(6.375f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.028f)
                lineToRelative(0.542f, 4.42f)
                lineToRelative(0.482f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.492f, 0.16f)
                lineToRelative(-0.41f, -3.83f)
                lineTo(10.53f, 15.75f)
                lineToRelative(-0.41f, 3.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.492f, -0.16f)
                lineToRelative(0.484f, -4.511f)
                lineToRelative(0.54f, -4.409f)
                lineTo(5.625f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _accessibilityInset24!!
    }

private var _accessibilityInset24: ImageVector? = null
