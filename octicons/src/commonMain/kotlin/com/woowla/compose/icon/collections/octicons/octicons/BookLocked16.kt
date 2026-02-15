package com.woowla.compose.icon.collections.octicons.octicons

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
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.BookLocked16: ImageVector
    get() {
        if (_bookLocked16 != null) {
            return _bookLocked16!!
        }
        _bookLocked16 = Builder(name = "BookLocked16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.168f)
                curveToRelative(0.591f, 0.281f, 1.0f, 0.884f, 1.0f, 1.582f)
                verticalLineToRelative(2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 16.0f)
                horizontalLineToRelative(-4.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 8.0f, 14.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.698f, 0.409f, -1.301f, 1.0f, -1.582f)
                lineTo(9.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(12.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.003f, 1.0f)
                curveToRelative(1.227f, 0.0f, 2.317f, 0.59f, 3.001f, 1.501f)
                arcTo(3.746f, 3.746f, 0.0f, false, true, 11.005f, 1.0f)
                horizontalLineToRelative(4.245f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineTo(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.495f)
                curveToRelative(-1.21f, 0.0f, -2.204f, 0.956f, -2.255f, 2.153f)
                verticalLineTo(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(4.69f)
                arcTo(2.249f, 2.249f, 0.0f, false, false, 5.003f, 2.5f)
                horizontalLineTo(1.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.758f)
                curveToRelative(0.612f, 0.0f, 1.208f, 0.15f, 1.74f, 0.429f)
                lineToRelative(0.005f, 0.001f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.705f, 1.324f)
                lineToRelative(-0.001f, -0.001f)
                verticalLineToRelative(0.002f)
                arcTo(2.245f, 2.245f, 0.0f, false, false, 5.258f, 13.0f)
                horizontalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineTo(1.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 0.75f, 1.0f)
                horizontalLineToRelative(4.253f)
                close()
            }
        }
        .build()
        return _bookLocked16!!
    }

private var _bookLocked16: ImageVector? = null
