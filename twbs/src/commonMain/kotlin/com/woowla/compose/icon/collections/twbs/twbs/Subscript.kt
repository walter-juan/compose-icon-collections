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

public val Twbs.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = Builder(name = "Subscript", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.266f, 12.496f)
                lineToRelative(0.96f, -2.853f)
                lineTo(7.76f, 9.643f)
                lineToRelative(0.96f, 2.853f)
                lineTo(10.0f, 12.496f)
                lineTo(6.62f, 3.0f)
                lineTo(5.38f, 3.0f)
                lineTo(2.0f, 12.496f)
                close()
                moveTo(6.014f, 4.433f)
                lineTo(7.433f, 8.663f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(1.426f, -4.23f)
                close()
                moveTo(12.146f, 11.636f)
                verticalLineToRelative(-0.075f)
                curveToRelative(0.0f, -0.332f, 0.234f, -0.618f, 0.619f, -0.618f)
                curveToRelative(0.354f, 0.0f, 0.618f, 0.256f, 0.618f, 0.58f)
                curveToRelative(0.0f, 0.362f, -0.271f, 0.649f, -0.52f, 0.898f)
                lineToRelative(-1.788f, 1.832f)
                lineTo(11.075f, 15.0f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(-0.958f)
                horizontalLineToRelative(-1.923f)
                verticalLineToRelative(-0.045f)
                lineToRelative(0.973f, -1.04f)
                curveToRelative(0.415f, -0.438f, 0.867f, -0.845f, 0.867f, -1.547f)
                curveToRelative(0.0f, -0.8f, -0.701f, -1.41f, -1.787f, -1.41f)
                curveToRelative(-1.23f, 0.0f, -1.795f, 0.8f, -1.795f, 1.576f)
                verticalLineToRelative(0.06f)
                close()
            }
        }
        .build()
        return _subscript!!
    }

private var _subscript: ImageVector? = null
