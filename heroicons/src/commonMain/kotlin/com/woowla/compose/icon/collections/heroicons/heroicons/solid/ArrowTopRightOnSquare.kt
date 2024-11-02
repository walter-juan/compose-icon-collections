package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ArrowTopRightOnSquare: ImageVector
    get() {
        if (_arrowTopRightOnSquare != null) {
            return _arrowTopRightOnSquare!!
        }
        _arrowTopRightOnSquare = Builder(name = "ArrowTopRightOnSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.75f, 2.25f)
                lineTo(21.0f, 2.25f)
                curveTo(21.199f, 2.25f, 21.39f, 2.329f, 21.53f, 2.47f)
                curveTo(21.671f, 2.61f, 21.75f, 2.801f, 21.75f, 3.0f)
                verticalLineTo(8.25f)
                curveTo(21.75f, 8.664f, 21.414f, 9.0f, 21.0f, 9.0f)
                curveTo(20.586f, 9.0f, 20.25f, 8.664f, 20.25f, 8.25f)
                verticalLineTo(4.811f)
                lineTo(8.03f, 17.03f)
                curveTo(7.737f, 17.323f, 7.263f, 17.323f, 6.97f, 17.03f)
                curveTo(6.677f, 16.737f, 6.677f, 16.263f, 6.97f, 15.97f)
                lineTo(19.189f, 3.75f)
                lineTo(15.75f, 3.75f)
                curveTo(15.336f, 3.75f, 15.0f, 3.414f, 15.0f, 3.0f)
                curveTo(15.0f, 2.586f, 15.336f, 2.25f, 15.75f, 2.25f)
                close()
                moveTo(5.25f, 6.75f)
                curveTo(4.422f, 6.75f, 3.75f, 7.422f, 3.75f, 8.25f)
                verticalLineTo(18.75f)
                curveTo(3.75f, 19.578f, 4.422f, 20.25f, 5.25f, 20.25f)
                horizontalLineTo(15.75f)
                curveTo(16.578f, 20.25f, 17.25f, 19.578f, 17.25f, 18.75f)
                verticalLineTo(10.5f)
                curveTo(17.25f, 10.086f, 17.586f, 9.75f, 18.0f, 9.75f)
                curveTo(18.414f, 9.75f, 18.75f, 10.086f, 18.75f, 10.5f)
                verticalLineTo(18.75f)
                curveTo(18.75f, 20.407f, 17.407f, 21.75f, 15.75f, 21.75f)
                horizontalLineTo(5.25f)
                curveTo(3.593f, 21.75f, 2.25f, 20.407f, 2.25f, 18.75f)
                verticalLineTo(8.25f)
                curveTo(2.25f, 6.593f, 3.593f, 5.25f, 5.25f, 5.25f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 5.25f, 14.25f, 5.586f, 14.25f, 6.0f)
                curveTo(14.25f, 6.414f, 13.914f, 6.75f, 13.5f, 6.75f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _arrowTopRightOnSquare!!
    }

private var _arrowTopRightOnSquare: ImageVector? = null
