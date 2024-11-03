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

public val Twbs.BootstrapFill: ImageVector
    get() {
        if (_bootstrapFill != null) {
            return _bootstrapFill!!
        }
        _bootstrapFill = Builder(name = "BootstrapFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.375f, 7.125f)
                lineTo(6.375f, 4.658f)
                horizontalLineToRelative(1.78f)
                curveToRelative(0.973f, 0.0f, 1.542f, 0.457f, 1.542f, 1.237f)
                curveToRelative(0.0f, 0.802f, -0.604f, 1.23f, -1.764f, 1.23f)
                close()
                moveTo(6.375f, 10.887f)
                horizontalLineToRelative(1.898f)
                curveToRelative(1.184f, 0.0f, 1.81f, -0.48f, 1.81f, -1.377f)
                curveToRelative(0.0f, -0.885f, -0.65f, -1.348f, -1.886f, -1.348f)
                lineTo(6.375f, 8.162f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.002f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(16.002f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(5.062f, 12.0f)
                lineTo(5.062f, 3.545f)
                horizontalLineToRelative(3.399f)
                curveToRelative(1.587f, 0.0f, 2.543f, 0.809f, 2.543f, 2.11f)
                curveToRelative(0.0f, 0.884f, -0.65f, 1.675f, -1.483f, 1.816f)
                verticalLineToRelative(0.1f)
                curveToRelative(1.143f, 0.117f, 1.904f, 0.931f, 1.904f, 2.033f)
                curveToRelative(0.0f, 1.488f, -1.084f, 2.396f, -2.888f, 2.396f)
                close()
            }
        }
        .build()
        return _bootstrapFill!!
    }

private var _bootstrapFill: ImageVector? = null
