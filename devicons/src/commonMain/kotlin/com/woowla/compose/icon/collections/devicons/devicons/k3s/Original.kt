package com.woowla.compose.icon.collections.devicons.devicons.k3s

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.K3sGroup

public val K3sGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFffc519)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.43f, 11.88f)
                lineTo(13.55f, 11.88f)
                curveTo(6.07f, 11.9f, 0.02f, 17.95f, 0.0f, 25.42f)
                verticalLineToRelative(77.72f)
                curveToRelative(0.02f, 7.47f, 6.07f, 13.52f, 13.55f, 13.55f)
                horizontalLineToRelative(100.89f)
                curveToRelative(7.47f, -0.02f, 13.52f, -6.07f, 13.55f, -13.55f)
                lineTo(127.98f, 25.42f)
                curveToRelative(-0.02f, -7.47f, -6.07f, -13.52f, -13.55f, -13.55f)
                close()
                moveTo(54.08f, 88.09f)
                lineToRelative(-24.62f, 14.31f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, -9.01f, -2.39f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, 2.39f, -9.01f)
                lineToRelative(24.62f, -14.31f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, 9.01f, 2.38f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, -2.39f, 9.01f)
                close()
                moveTo(63.77f, 66.29f)
                horizontalLineToRelative(-0.03f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, -6.56f, -6.62f)
                lineToRelative(0.13f, -28.36f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, 6.59f, -6.56f)
                horizontalLineToRelative(0.03f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, 6.56f, 6.62f)
                lineToRelative(-0.13f, 28.37f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, -6.59f, 6.56f)
                close()
                moveTo(107.33f, 100.0f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, -9.0f, 2.41f)
                lineTo(73.67f, 88.17f)
                arcToRelative(6.59f, 6.59f, 0.0f, true, true, 6.59f, -11.41f)
                lineToRelative(24.66f, 14.23f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, 2.41f, 9.0f)
                close()
                moveTo(107.33f, 100.0f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
