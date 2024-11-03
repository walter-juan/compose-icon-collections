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

public val Twbs.SignTurnRightFill: ImageVector
    get() {
        if (_signTurnRightFill != null) {
            return _signTurnRightFill!!
        }
        _signTurnRightFill = Builder(name = "SignTurnRightFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0.0f)
                lineTo(0.436f, 6.95f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0.0f, 2.098f)
                lineToRelative(6.516f, 6.516f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0.0f)
                lineToRelative(6.516f, -6.516f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0.0f, -2.098f)
                close()
                moveTo(9.0f, 8.466f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 8.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.5f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.534f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0.0f, 0.384f)
                lineTo(9.41f, 8.658f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 9.0f, 8.466f)
            }
        }
        .build()
        return _signTurnRightFill!!
    }

private var _signTurnRightFill: ImageVector? = null
