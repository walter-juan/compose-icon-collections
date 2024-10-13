package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlMedium: ImageVector
    get() {
        if (_bxlMedium != null) {
            return _bxlMedium!!
        }
        _bxlMedium = Builder(name = "BxlMedium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.285f, 7.269f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, false, -0.24f, -0.619f)
                lineToRelative(-1.77f, -2.133f)
                verticalLineToRelative(-0.32f)
                horizontalLineToRelative(5.498f)
                lineToRelative(4.25f, 9.32f)
                lineToRelative(3.736f, -9.32f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(0.319f)
                lineToRelative(-1.515f, 1.451f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, -0.168f, 0.425f)
                verticalLineToRelative(10.666f)
                arcToRelative(0.448f, 0.448f, 0.0f, false, false, 0.168f, 0.425f)
                lineToRelative(1.479f, 1.451f)
                verticalLineToRelative(0.319f)
                horizontalLineToRelative(-7.436f)
                verticalLineToRelative(-0.319f)
                lineToRelative(1.529f, -1.487f)
                curveToRelative(0.152f, -0.15f, 0.152f, -0.195f, 0.152f, -0.424f)
                verticalLineTo(8.401f)
                lineTo(10.95f, 19.218f)
                horizontalLineToRelative(-0.575f)
                lineTo(5.417f, 8.401f)
                verticalLineToRelative(7.249f)
                curveToRelative(-0.041f, 0.305f, 0.06f, 0.612f, 0.275f, 0.833f)
                lineTo(7.684f, 18.9f)
                verticalLineToRelative(0.319f)
                horizontalLineTo(2.036f)
                verticalLineTo(18.9f)
                lineToRelative(1.992f, -2.417f)
                arcToRelative(0.971f, 0.971f, 0.0f, false, false, 0.257f, -0.833f)
                verticalLineTo(7.269f)
                close()
            }
        }
        .build()
        return _bxlMedium!!
    }

private var _bxlMedium: ImageVector? = null
