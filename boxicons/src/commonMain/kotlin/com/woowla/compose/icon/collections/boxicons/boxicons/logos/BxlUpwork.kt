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

public val LogosGroup.BxlUpwork: ImageVector
    get() {
        if (_bxlUpwork != null) {
            return _bxlUpwork!!
        }
        _bxlUpwork = Builder(name = "BxlUpwork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.47f, 6.07f)
                arcToRelative(4.54f, 4.54f, 0.0f, false, false, -4.38f, 3.69f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -2.28f, -4.9f)
                lineTo(8.55f, 4.86f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.14f, 2.14f, 0.0f, true, true, -4.28f, 0.0f)
                verticalLineToRelative(-6.0f)
                lineTo(2.0f, 4.91f)
                verticalLineToRelative(6.0f)
                arcToRelative(4.4f, 4.4f, 0.0f, true, false, 8.8f, -0.05f)
                verticalLineToRelative(-1.0f)
                arcToRelative(20.55f, 20.55f, 0.0f, false, false, 1.65f, 2.7f)
                lineToRelative(-1.38f, 6.61f)
                horizontalLineToRelative(2.32f)
                lineToRelative(1.0f, -4.81f)
                arcToRelative(5.61f, 5.61f, 0.0f, false, false, 3.11f, 0.89f)
                arcToRelative(4.57f, 4.57f, 0.0f, false, false, 0.0f, -9.14f)
                close()
                moveTo(17.47f, 12.9f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, -2.55f, -1.0f)
                lineToRelative(0.23f, -0.91f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0.16f, -1.0f, 0.66f, -2.6f, 2.35f, -2.6f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.27f, 2.24f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, true, -2.27f, 2.32f)
                close()
            }
        }
        .build()
        return _bxlUpwork!!
    }

private var _bxlUpwork: ImageVector? = null
