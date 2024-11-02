package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.ArchiveBoxArrowDown: ImageVector
    get() {
        if (_archiveBoxArrowDown != null) {
            return _archiveBoxArrowDown!!
        }
        _archiveBoxArrowDown = Builder(name = "ArchiveBoxArrowDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.25f, 7.5f)
                lineTo(19.625f, 18.132f)
                curveTo(19.555f, 19.321f, 18.57f, 20.25f, 17.378f, 20.25f)
                horizontalLineTo(6.622f)
                curveTo(5.43f, 20.25f, 4.445f, 19.321f, 4.375f, 18.132f)
                lineTo(3.75f, 7.5f)
                moveTo(12.0f, 10.5f)
                verticalLineTo(17.25f)
                moveTo(12.0f, 17.25f)
                lineTo(9.0f, 14.25f)
                moveTo(12.0f, 17.25f)
                lineTo(15.0f, 14.25f)
                moveTo(3.375f, 7.5f)
                horizontalLineTo(20.625f)
                curveTo(21.246f, 7.5f, 21.75f, 6.996f, 21.75f, 6.375f)
                verticalLineTo(4.875f)
                curveTo(21.75f, 4.254f, 21.246f, 3.75f, 20.625f, 3.75f)
                horizontalLineTo(3.375f)
                curveTo(2.754f, 3.75f, 2.25f, 4.254f, 2.25f, 4.875f)
                verticalLineTo(6.375f)
                curveTo(2.25f, 6.996f, 2.754f, 7.5f, 3.375f, 7.5f)
                close()
            }
        }
        .build()
        return _archiveBoxArrowDown!!
    }

private var _archiveBoxArrowDown: ImageVector? = null
