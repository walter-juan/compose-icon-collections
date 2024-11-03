package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.SignTurnSlightRight: ImageVector
    get() {
        if (_signTurnSlightRight != null) {
            return _signTurnSlightRight!!
        }
        _signTurnSlightRight = Builder(name = "SignTurnSlightRight", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.335f, 6.982f)
                lineToRelative(0.8f, 1.386f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.451f, -0.039f)
                lineToRelative(1.06f, -2.882f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.192f, -0.333f)
                lineToRelative(-3.026f, -0.523f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.26f, 0.371f)
                lineToRelative(0.667f, 1.154f)
                lineToRelative(-0.621f, 0.373f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.0f, 8.632f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(8.632f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.728f, -1.286f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.95f, 0.435f)
                curveToRelative(0.58f, -0.58f, 1.52f, -0.58f, 2.1f, 0.0f)
                lineToRelative(6.515f, 6.516f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.519f, 0.0f, 2.098f)
                lineTo(9.05f, 15.565f)
                curveToRelative(-0.58f, 0.58f, -1.519f, 0.58f, -2.098f, 0.0f)
                lineTo(0.435f, 9.05f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, true, 0.0f, -2.098f)
                close()
                moveTo(8.35f, 1.135f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, -0.7f, 0.0f)
                lineTo(1.134f, 7.65f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.0f, 0.7f)
                lineToRelative(6.516f, 6.516f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.7f, 0.0f)
                lineToRelative(6.516f, -6.516f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.0f, -0.7f)
                lineTo(8.35f, 1.134f)
                close()
            }
        }
        .build()
        return _signTurnSlightRight!!
    }

private var _signTurnSlightRight: ImageVector? = null
