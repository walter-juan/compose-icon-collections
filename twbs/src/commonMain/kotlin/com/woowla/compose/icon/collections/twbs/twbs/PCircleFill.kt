package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.PCircleFill: ImageVector
    get() {
        if (_pCircleFill != null) {
            return _pCircleFill!!
        }
        _pCircleFill = Builder(name = "PCircleFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(5.5f, 4.002f)
                lineTo(5.5f, 12.0f)
                horizontalLineToRelative(1.283f)
                lineTo(6.783f, 9.164f)
                horizontalLineToRelative(1.668f)
                curveTo(10.033f, 9.164f, 11.0f, 8.08f, 11.0f, 6.586f)
                curveToRelative(0.0f, -1.482f, -0.955f, -2.584f, -2.538f, -2.584f)
                close()
                moveTo(8.27f, 8.074f)
                curveToRelative(0.893f, 0.0f, 1.419f, -0.545f, 1.419f, -1.488f)
                reflectiveCurveToRelative(-0.526f, -1.482f, -1.42f, -1.482f)
                lineTo(6.778f, 5.104f)
                verticalLineToRelative(2.97f)
                close()
            }
        }
        .build()
        return _pCircleFill!!
    }

private var _pCircleFill: ImageVector? = null
