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

public val Twbs.CCircleFill: ImageVector
    get() {
        if (_cCircleFill != null) {
            return _cCircleFill!!
        }
        _cCircleFill = Builder(name = "CCircleFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(8.146f, 4.992f)
                curveToRelative(0.961f, 0.0f, 1.641f, 0.633f, 1.729f, 1.512f)
                horizontalLineToRelative(1.295f)
                verticalLineToRelative(-0.088f)
                curveToRelative(-0.094f, -1.518f, -1.348f, -2.572f, -3.03f, -2.572f)
                curveToRelative(-2.068f, 0.0f, -3.269f, 1.377f, -3.269f, 3.638f)
                verticalLineToRelative(1.073f)
                curveToRelative(0.0f, 2.267f, 1.178f, 3.603f, 3.27f, 3.603f)
                curveToRelative(1.675f, 0.0f, 2.93f, -1.02f, 3.029f, -2.467f)
                verticalLineToRelative(-0.093f)
                horizontalLineTo(9.875f)
                curveToRelative(-0.088f, 0.832f, -0.75f, 1.418f, -1.729f, 1.418f)
                curveToRelative(-1.224f, 0.0f, -1.927f, -0.891f, -1.927f, -2.461f)
                verticalLineToRelative(-1.06f)
                curveToRelative(0.0f, -1.583f, 0.715f, -2.503f, 1.927f, -2.503f)
            }
        }
        .build()
        return _cCircleFill!!
    }

private var _cCircleFill: ImageVector? = null
