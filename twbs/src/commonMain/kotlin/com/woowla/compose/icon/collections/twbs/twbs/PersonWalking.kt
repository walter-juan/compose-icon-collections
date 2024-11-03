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

public val Twbs.PersonWalking: ImageVector
    get() {
        if (_personWalking != null) {
            return _personWalking!!
        }
        _personWalking = Builder(name = "PersonWalking", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveTo(6.44f, 3.752f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.0f, 3.5f)
                horizontalLineToRelative(1.445f)
                curveToRelative(0.742f, 0.0f, 1.32f, 0.643f, 1.243f, 1.38f)
                lineToRelative(-0.43f, 4.083f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.088f, 0.395f)
                lineToRelative(-0.318f, 0.906f)
                lineToRelative(0.213f, 0.242f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.114f, 0.175f)
                lineToRelative(2.0f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.357f, 0.638f)
                lineToRelative(-1.956f, -4.154f)
                lineToRelative(-1.68f, -1.921f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.0f, 8.96f)
                lineToRelative(0.138f, -2.613f)
                lineToRelative(-0.435f, 0.489f)
                lineToRelative(-0.464f, 2.786f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.48f, -0.246f)
                lineToRelative(0.5f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.18f, -0.375f)
                lineToRelative(2.0f, -2.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 11.745f)
                verticalLineToRelative(-1.418f)
                lineToRelative(1.204f, 1.375f)
                lineToRelative(0.261f, 0.524f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.12f, 0.231f)
                lineToRelative(-2.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.19f, -0.914f)
                close()
                moveTo(10.47f, 7.53f)
                lineTo(9.976f, 7.036f)
                lineTo(10.181f, 5.193f)
                lineTo(10.187f, 5.126f)
                lineTo(11.311f, 6.25f)
                horizontalLineToRelative(1.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(11.0f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.531f, -0.22f)
                close()
            }
        }
        .build()
        return _personWalking!!
    }

private var _personWalking: ImageVector? = null
