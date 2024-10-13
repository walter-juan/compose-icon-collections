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

public val SolidGroup.BxsHeartSquare: ImageVector
    get() {
        if (_bxsHeartSquare != null) {
            return _bxsHeartSquare!!
        }
        _bxsHeartSquare = Builder(name = "BxsHeartSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 21.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
                moveTo(7.812f, 8.907f)
                arcToRelative(2.746f, 2.746f, 0.0f, false, true, 3.907f, 0.0f)
                lineToRelative(0.279f, 0.279f)
                lineToRelative(0.278f, -0.279f)
                arcToRelative(2.746f, 2.746f, 0.0f, false, true, 3.907f, 0.0f)
                arcToRelative(2.745f, 2.745f, 0.0f, false, true, 0.0f, 3.907f)
                lineTo(11.998f, 17.0f)
                lineToRelative(-4.187f, -4.186f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, true, 0.001f, -3.907f)
                close()
            }
        }
        .build()
        return _bxsHeartSquare!!
    }

private var _bxsHeartSquare: ImageVector? = null
