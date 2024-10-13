package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxWalk: ImageVector
    get() {
        if (_bxWalk != null) {
            return _bxWalk!!
        }
        _bxWalk = Builder(name = "BxWalk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.978f, 12.27f)
                curveToRelative(0.245f, 0.368f, 0.611f, 0.647f, 1.031f, 0.787f)
                lineToRelative(2.675f, 0.892f)
                lineToRelative(0.633f, -1.896f)
                lineToRelative(-2.675f, -0.892f)
                lineToRelative(-1.663f, -2.495f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, false, -0.769f, -0.679f)
                lineToRelative(-1.434f, -0.717f)
                arcToRelative(1.989f, 1.989f, 0.0f, false, false, -1.378f, -0.149f)
                lineToRelative(-3.193f, 0.797f)
                arcToRelative(2.002f, 2.002f, 0.0f, false, false, -1.306f, 1.046f)
                lineToRelative(-1.794f, 3.589f)
                lineToRelative(1.789f, 0.895f)
                lineToRelative(1.794f, -3.589f)
                lineToRelative(2.223f, -0.556f)
                lineToRelative(-1.804f, 8.346f)
                lineToRelative(-3.674f, 2.527f)
                lineToRelative(1.133f, 1.648f)
                lineToRelative(3.675f, -2.528f)
                curveToRelative(0.421f, -0.29f, 0.713f, -0.725f, 0.82f, -1.225f)
                lineToRelative(0.517f, -2.388f)
                lineToRelative(2.517f, 1.888f)
                lineToRelative(0.925f, 4.625f)
                lineToRelative(1.961f, -0.393f)
                lineToRelative(-0.925f, -4.627f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.762f, -1.206f)
                lineToRelative(-2.171f, -1.628f)
                lineToRelative(0.647f, -3.885f)
                lineToRelative(1.208f, 1.813f)
                close()
            }
        }
        .build()
        return _bxWalk!!
    }

private var _bxWalk: ImageVector? = null
