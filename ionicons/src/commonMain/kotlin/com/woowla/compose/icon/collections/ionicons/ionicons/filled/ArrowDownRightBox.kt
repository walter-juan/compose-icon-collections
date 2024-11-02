package com.woowla.compose.icon.collections.ionicons.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.ArrowDownRightBox: ImageVector
    get() {
        if (_arrowDownRightBox != null) {
            return _arrowDownRightBox!!
        }
        _arrowDownRightBox = Builder(name = "ArrowDownRightBox", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(480.0f, 331.64f)
                lineTo(480.0f, 464.0f)
                curveTo(480.0f, 468.24f, 478.31f, 472.31f, 475.31f, 475.31f)
                curveTo(472.31f, 478.31f, 468.24f, 480.0f, 464.0f, 480.0f)
                horizontalLineTo(331.64f)
                curveTo(322.8f, 480.0f, 315.64f, 472.84f, 315.64f, 464.0f)
                curveTo(315.64f, 455.16f, 322.8f, 448.0f, 331.64f, 448.0f)
                horizontalLineTo(425.37f)
                lineTo(374.24f, 396.87f)
                curveTo(378.96f, 394.25f, 383.33f, 390.97f, 387.22f, 387.09f)
                curveTo(391.05f, 383.25f, 394.3f, 378.93f, 396.91f, 374.28f)
                lineTo(448.0f, 425.37f)
                lineTo(448.0f, 331.64f)
                curveTo(448.0f, 322.8f, 455.16f, 315.64f, 464.0f, 315.64f)
                curveTo(472.84f, 315.64f, 480.0f, 322.8f, 480.0f, 331.64f)
                close()
                moveTo(396.91f, 374.28f)
                curveTo(401.75f, 365.62f, 404.36f, 355.79f, 404.36f, 345.69f)
                verticalLineTo(90.55f)
                curveTo(404.36f, 75.02f, 398.2f, 60.13f, 387.22f, 49.15f)
                curveTo(376.24f, 38.17f, 361.35f, 32.0f, 345.82f, 32.0f)
                lineTo(90.55f, 32.0f)
                curveTo(75.02f, 32.0f, 60.13f, 38.17f, 49.15f, 49.15f)
                curveTo(38.17f, 60.13f, 32.0f, 75.02f, 32.0f, 90.55f)
                verticalLineTo(345.82f)
                curveTo(32.0f, 361.35f, 38.17f, 376.24f, 49.15f, 387.22f)
                curveTo(60.13f, 398.2f, 75.02f, 404.36f, 90.55f, 404.36f)
                horizontalLineTo(345.82f)
                curveTo(346.63f, 404.36f, 347.42f, 404.3f, 348.2f, 404.19f)
                curveTo(357.39f, 403.82f, 366.31f, 401.28f, 374.24f, 396.87f)
                lineTo(204.69f, 227.31f)
                curveTo(198.44f, 221.07f, 198.44f, 210.93f, 204.69f, 204.69f)
                curveTo(210.93f, 198.44f, 221.07f, 198.44f, 227.31f, 204.69f)
                lineTo(396.91f, 374.28f)
                close()
            }
        }
        .build()
        return _arrowDownRightBox!!
    }

private var _arrowDownRightBox: ImageVector? = null
