package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsHourglassTop: ImageVector
    get() {
        if (_bxsHourglassTop != null) {
            return _bxsHourglassTop!!
        }
        _bxsHourglassTop = Builder(name = "BxsHourglassTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.566f, 11.021f)
                arcTo(7.016f, 7.016f, 0.0f, false, false, 19.0f, 5.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(7.016f, 7.016f, 0.0f, false, false, 3.434f, 6.021f)
                curveToRelative(0.354f, 0.208f, 0.566f, 0.545f, 0.566f, 0.9f)
                verticalLineToRelative(0.158f)
                curveToRelative(0.0f, 0.354f, -0.212f, 0.69f, -0.566f, 0.9f)
                arcTo(7.016f, 7.016f, 0.0f, false, false, 5.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(7.014f, 7.014f, 0.0f, false, false, -3.433f, -6.02f)
                curveToRelative(-0.355f, -0.21f, -0.567f, -0.547f, -0.567f, -0.901f)
                verticalLineToRelative(-0.158f)
                curveToRelative(0.0f, -0.355f, 0.212f, -0.692f, 0.566f, -0.9f)
                close()
                moveTo(17.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, true, 2.45f, -4.299f)
                arcTo(3.111f, 3.111f, 0.0f, false, false, 10.834f, 13.0f)
                horizontalLineToRelative(2.332f)
                curveToRelative(0.23f, 0.691f, 0.704f, 1.3f, 1.385f, 1.702f)
                arcTo(5.008f, 5.008f, 0.0f, false, true, 17.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bxsHourglassTop!!
    }

private var _bxsHourglassTop: ImageVector? = null
