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

public val Twbs.CCircle: ImageVector
    get() {
        if (_cCircle != null) {
            return _cCircle!!
        }
        _cCircle = Builder(name = "CCircle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 1.0f, 8.0f)
                moveToRelative(15.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(8.146f, 4.992f)
                curveToRelative(-1.212f, 0.0f, -1.927f, 0.92f, -1.927f, 2.502f)
                verticalLineToRelative(1.06f)
                curveToRelative(0.0f, 1.571f, 0.703f, 2.462f, 1.927f, 2.462f)
                curveToRelative(0.979f, 0.0f, 1.641f, -0.586f, 1.729f, -1.418f)
                horizontalLineToRelative(1.295f)
                verticalLineToRelative(0.093f)
                curveToRelative(-0.1f, 1.448f, -1.354f, 2.467f, -3.03f, 2.467f)
                curveToRelative(-2.091f, 0.0f, -3.269f, -1.336f, -3.269f, -3.603f)
                verticalLineTo(7.482f)
                curveToRelative(0.0f, -2.261f, 1.201f, -3.638f, 3.27f, -3.638f)
                curveToRelative(1.681f, 0.0f, 2.935f, 1.054f, 3.029f, 2.572f)
                verticalLineToRelative(0.088f)
                horizontalLineTo(9.875f)
                curveToRelative(-0.088f, -0.879f, -0.768f, -1.512f, -1.729f, -1.512f)
            }
        }
        .build()
        return _cCircle!!
    }

private var _cCircle: ImageVector? = null
