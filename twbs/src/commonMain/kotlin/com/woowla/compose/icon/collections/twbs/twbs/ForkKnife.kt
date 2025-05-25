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

public val Twbs.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 0.5f)
                curveToRelative(0.0f, -0.276f, -0.226f, -0.506f, -0.498f, -0.465f)
                curveToRelative(-1.703f, 0.257f, -2.94f, 2.012f, -3.0f, 8.462f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.498f, 0.5f)
                curveToRelative(0.56f, 0.01f, 1.0f, 0.13f, 1.0f, 1.003f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(4.25f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(5.122f)
                arcToRelative(0.128f, 0.128f, 0.0f, false, false, 0.256f, 0.006f)
                lineToRelative(0.233f, -5.14f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 5.24f, 0.0f)
                horizontalLineToRelative(0.522f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.238f)
                lineToRelative(0.233f, 5.14f)
                arcToRelative(0.128f, 0.128f, 0.0f, false, false, 0.256f, -0.006f)
                verticalLineTo(0.25f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 6.75f, 0.0f)
                horizontalLineToRelative(0.29f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.498f, 0.458f)
                lineToRelative(0.423f, 5.07f)
                arcToRelative(1.69f, 1.69f, 0.0f, false, true, -1.059f, 1.711f)
                lineToRelative(-0.053f, 0.022f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, -0.58f, 0.884f)
                lineTo(6.47f, 15.0f)
                arcToRelative(0.971f, 0.971f, 0.0f, true, true, -1.942f, 0.0f)
                lineToRelative(0.202f, -6.855f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, -0.58f, -0.884f)
                lineToRelative(-0.053f, -0.022f)
                arcToRelative(1.69f, 1.69f, 0.0f, false, true, -1.059f, -1.712f)
                lineTo(3.462f, 0.458f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.96f, 0.0f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
