package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.PSquareFill: ImageVector
    get() {
        if (_pSquareFill != null) {
            return _pSquareFill!!
        }
        _pSquareFill = Builder(name = "PSquareFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.27f, 8.074f)
                curveToRelative(0.893f, 0.0f, 1.419f, -0.545f, 1.419f, -1.488f)
                reflectiveCurveToRelative(-0.526f, -1.482f, -1.42f, -1.482f)
                horizontalLineTo(6.778f)
                verticalLineToRelative(2.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(5.5f, 4.002f)
                horizontalLineToRelative(2.962f)
                curveTo(10.045f, 4.002f, 11.0f, 5.104f, 11.0f, 6.586f)
                curveToRelative(0.0f, 1.494f, -0.967f, 2.578f, -2.55f, 2.578f)
                lineTo(6.784f, 9.164f)
                lineTo(6.784f, 12.0f)
                lineTo(5.5f, 12.0f)
                close()
            }
        }
        .build()
        return _pSquareFill!!
    }

private var _pSquareFill: ImageVector? = null
