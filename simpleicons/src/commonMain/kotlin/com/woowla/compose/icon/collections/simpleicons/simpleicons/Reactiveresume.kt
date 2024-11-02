package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Reactiveresume: ImageVector
    get() {
        if (_reactiveresume != null) {
            return _reactiveresume!!
        }
        _reactiveresume = Builder(name = "Reactiveresume", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.393f)
                verticalLineToRelative(12.949f)
                horizontalLineToRelative(3.662f)
                verticalLineToRelative(-3.44f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.8f, -0.002f, 4.084f, -0.395f, 5.276f, -2.183f)
                curveToRelative(0.468f, -0.716f, 0.703f, -1.56f, 0.703f, -2.535f)
                curveToRelative(0.0f, -0.986f, -0.235f, -1.836f, -0.704f, -2.551f)
                curveToRelative(-0.468f, -0.728f, -1.135f, -1.284f, -1.998f, -1.666f)
                curveToRelative(-0.85f, -0.382f, -1.836f, -0.574f, -3.02f, -0.574f)
                lineTo(0.0f, 3.393f)
                close()
                moveTo(3.662f, 6.279f)
                horizontalLineToRelative(2.035f)
                curveToRelative(0.765f, 0.0f, 1.331f, 0.167f, 1.701f, 0.5f)
                curveToRelative(0.382f, 0.332f, 0.575f, 0.8f, 0.575f, 1.405f)
                curveToRelative(0.0f, 0.592f, -0.193f, 1.055f, -0.575f, 1.388f)
                curveToRelative(-0.37f, 0.333f, -0.936f, 0.5f, -1.7f, 0.5f)
                lineTo(3.661f, 10.072f)
                lineTo(3.661f, 6.28f)
                close()
                moveTo(12.568f, 10.58f)
                lineTo(16.332f, 15.592f)
                lineTo(12.568f, 20.607f)
                horizontalLineToRelative(3.92f)
                lineToRelative(1.795f, -2.388f)
                lineToRelative(1.795f, 2.388f)
                lineTo(24.0f, 20.607f)
                lineTo(16.488f, 10.58f)
                horizontalLineToRelative(-3.92f)
                close()
                moveTo(20.078f, 10.58f)
                lineTo(18.709f, 12.414f)
                lineTo(20.678f, 15.024f)
                lineTo(24.0f, 10.58f)
                horizontalLineToRelative(-3.922f)
                close()
                moveTo(9.096f, 12.912f)
                reflectiveCurveToRelative(-1.496f, 0.628f, -3.467f, 0.604f)
                lineToRelative(2.115f, 2.826f)
                horizontalLineToRelative(3.92f)
                lineToRelative(-2.568f, -3.43f)
                close()
            }
        }
        .build()
        return _reactiveresume!!
    }

private var _reactiveresume: ImageVector? = null
