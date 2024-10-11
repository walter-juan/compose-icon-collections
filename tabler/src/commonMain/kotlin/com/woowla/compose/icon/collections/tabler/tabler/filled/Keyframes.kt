package com.woowla.compose.icon.collections.tabler.tabler.filled

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
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Keyframes: ImageVector
    get() {
        if (_keyframes != null) {
            return _keyframes!!
        }
        _keyframes = Builder(name = "Keyframes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                arcToRelative(2.599f, 2.599f, 0.0f, false, false, -2.0f, 0.957f)
                lineToRelative(-4.355f, 5.24f)
                arcToRelative(2.847f, 2.847f, 0.0f, false, false, -0.007f, 3.598f)
                lineToRelative(4.368f, 5.256f)
                curveToRelative(0.499f, 0.6f, 1.224f, 0.949f, 1.994f, 0.949f)
                arcToRelative(2.599f, 2.599f, 0.0f, false, false, 2.0f, -0.957f)
                lineToRelative(4.355f, -5.24f)
                arcToRelative(2.847f, 2.847f, 0.0f, false, false, 0.007f, -3.598f)
                lineToRelative(-4.368f, -5.256f)
                arcToRelative(2.593f, 2.593f, 0.0f, false, false, -1.994f, -0.949f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.382f, 4.214f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, 0.074f)
                lineToRelative(0.084f, 0.094f)
                lineToRelative(4.576f, 5.823f)
                curveToRelative(0.808f, 0.993f, 0.848f, 2.396f, 0.13f, 3.419f)
                lineToRelative(-0.12f, 0.158f)
                lineToRelative(-4.586f, 5.836f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.644f, -1.132f)
                lineToRelative(0.072f, -0.104f)
                lineToRelative(4.596f, -5.85f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, false, 0.06f, -0.978f)
                lineToRelative(-0.07f, -0.1f)
                lineToRelative(-4.586f, -5.836f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.168f, -1.404f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.382f, 4.214f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, 0.074f)
                lineToRelative(0.084f, 0.094f)
                lineToRelative(4.576f, 5.823f)
                curveToRelative(0.808f, 0.993f, 0.848f, 2.396f, 0.13f, 3.419f)
                lineToRelative(-0.12f, 0.158f)
                lineToRelative(-4.586f, 5.836f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.644f, -1.132f)
                lineToRelative(0.072f, -0.104f)
                lineToRelative(4.596f, -5.85f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, false, 0.06f, -0.978f)
                lineToRelative(-0.07f, -0.1f)
                lineToRelative(-4.586f, -5.836f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.168f, -1.404f)
                close()
            }
        }
        .build()
        return _keyframes!!
    }

private var _keyframes: ImageVector? = null
