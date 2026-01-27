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

public val Simpleicons.Paysafe: ImageVector
    get() {
        if (_paysafe != null) {
            return _paysafe!!
        }
        _paysafe = Builder(name = "Paysafe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.905f, 12.233f)
                lineToRelative(-7.672f, 7.673f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, true, -0.115f, 0.047f)
                horizontalLineToRelative(-0.048f)
                arcToRelative(0.162f, 0.162f, 0.0f, false, true, -0.162f, -0.161f)
                verticalLineToRelative(-7.787f)
                arcToRelative(0.324f, 0.324f, 0.0f, false, true, -0.094f, 0.228f)
                lineTo(8.188f, 19.86f)
                arcToRelative(0.332f, 0.332f, 0.0f, false, true, -0.466f, 0.0f)
                lineTo(0.095f, 12.235f)
                arcToRelative(0.332f, 0.332f, 0.0f, false, true, 0.0f, -0.466f)
                lineTo(7.72f, 4.142f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, true, 0.467f, 0.0f)
                lineToRelative(7.625f, 7.625f)
                curveToRelative(0.06f, 0.06f, 0.094f, 0.143f, 0.094f, 0.23f)
                verticalLineTo(4.208f)
                curveToRelative(0.0f, -0.089f, 0.073f, -0.162f, 0.162f, -0.162f)
                horizontalLineToRelative(0.048f)
                curveToRelative(0.043f, 0.0f, 0.084f, 0.018f, 0.115f, 0.048f)
                lineToRelative(7.672f, 7.672f)
                arcToRelative(0.333f, 0.333f, 0.0f, false, true, 0.002f, 0.467f)
                close()
            }
        }
        .build()
        return _paysafe!!
    }

private var _paysafe: ImageVector? = null
