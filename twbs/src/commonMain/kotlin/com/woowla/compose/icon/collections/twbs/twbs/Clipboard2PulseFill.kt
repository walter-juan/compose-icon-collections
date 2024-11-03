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

public val Twbs.Clipboard2PulseFill: ImageVector
    get() {
        if (_clipboard2PulseFill != null) {
            return _clipboard2PulseFill!!
        }
        _clipboard2PulseFill = Builder(name = "Clipboard2PulseFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineTo(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.0f, 2.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.085f, 1.0f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.0f, 2.5f)
                verticalLineToRelative(12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 16.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 1.0f)
                horizontalLineToRelative(-0.585f)
                quadToRelative(0.084f, 0.236f, 0.085f, 0.5f)
                verticalLineTo(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 2.0f)
                verticalLineToRelative(-0.5f)
                quadToRelative(0.001f, -0.264f, 0.085f, -0.5f)
                moveTo(9.98f, 5.356f)
                lineTo(11.372f, 10.0f)
                horizontalLineToRelative(0.128f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.479f, -0.356f)
                lineToRelative(-0.94f, -3.135f)
                lineToRelative(-1.092f, 5.096f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.968f, 0.039f)
                lineTo(6.383f, 8.85f)
                lineToRelative(-0.936f, 1.873f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 11.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(0.191f)
                lineToRelative(1.362f, -2.724f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.926f, 0.08f)
                lineToRelative(0.94f, 3.135f)
                lineToRelative(1.092f, -5.096f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.968f, -0.039f)
                close()
            }
        }
        .build()
        return _clipboard2PulseFill!!
    }

private var _clipboard2PulseFill: ImageVector? = null
