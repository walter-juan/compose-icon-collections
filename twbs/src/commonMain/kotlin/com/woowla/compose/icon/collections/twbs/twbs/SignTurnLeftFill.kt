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

public val Twbs.SignTurnLeftFill: ImageVector
    get() {
        if (_signTurnLeftFill != null) {
            return _signTurnLeftFill!!
        }
        _signTurnLeftFill = Builder(name = "SignTurnLeftFill", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
                moveTo(7.0f, 8.466f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.41f, 0.192f)
                lineTo(4.23f, 6.692f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.384f)
                lineToRelative(2.36f, -1.966f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.41f, 0.192f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.0f, 8.5f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 7.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _signTurnLeftFill!!
    }

private var _signTurnLeftFill: ImageVector? = null
